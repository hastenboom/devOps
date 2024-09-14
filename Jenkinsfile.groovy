pipeline {
    agent any
    stages {
        stage('pull code') {
            steps {
                checkout scmGit(branches: [[name: '*/practice-point']], extensions: [], userRemoteConfigs: [[credentialsId: '7f6af47c-af1a-4034-8fe8-cbab52605782', url: 'https://github.com/hastenboom/devOps.git']])
            }
        }
        stage('clean') {
            steps {
                /*   sh 'sudo docker container ls -a --format "{{.Names}}" | grep \'^dev-ops\' | xargs -I {} sudo docker -f rm {}'
                  sh ' sudo docker image ls | grep \'^dev-ops\' | awk \'{print $3}\' | xargs -I {} sudo docker rmi -f {}' */
                /*  sh 'chmod +x clean.sh'
                 sh 'chmod +x build.sh'
                 // 执行当前目录下的clean.sh脚本
                 sh 'sudo ./clean.sh'
                 // 执行当前目录下的build.sh脚本
                 sh 'sudo ./build.sh' */
                script {
                    echo "Listing all Docker containers..."
                    sh "ls"
                    sh 'sudo docker container ls -a --format "{{.Names}}"'

                    echo "Removing dev-ops containers..."
                    sh 'sudo docker container ls -a --format "{{.Names}}" | grep "^dev-ops$" | xargs -rI {} sudo docker rm -f {}'

                    echo "Listing all Docker images..."
                    sh 'sudo docker image ls'

                    echo "Removing dev-ops images..."
                    sh 'sudo docker image ls | grep "^dev-ops$" | awk "{print \$3}" | xargs -rI {} sudo docker rmi -f {}'
                }
            }

        }
        stage('build') {
            steps {
                script {
                    sh 'mvn clean package'
                    sh 'sudo docker compose up --build'
                }
            }
        }
    }
}