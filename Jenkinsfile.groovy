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
                script {

                    sh 'chmod +x clean.sh'
                    sh 'chmod +x build.sh'
                    // 执行当前目录下的clean.sh脚本
                    sh 'sudo ./clean.sh'
                    // 执行当前目录下的build.sh脚本
                    sh 'sudo ./build.sh'
                }
            }
        }
        stage('build') {
            steps {
                script {
                    sh 'mvn clean package'
                    sh 'sudo docker compose up --build -d'
                }
            }
        }
    }
}