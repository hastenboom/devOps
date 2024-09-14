#!/bin/bash
# Remove all containers and images with dev-ops prefix

sudo docker container ls -a --format "{{.Names}}" | grep '^dev-ops' | xargs -I {} sudo docker -f rm {}

sudo docker image ls | grep '^dev-ops' | awk '{print $3}' | xargs -I {} sudo docker rmi -f {}