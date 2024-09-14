#!/bin/bash

# Remove all containers and images with dev-ops prefix

# Remove containers
echo "Removing containers..."
sudo docker container ls -a --format "{{.Names}}" | grep '^dev-ops' | xargs -I {} sudo docker -f rm {} || echo "Error removing containers"

# Remove images
echo "Removing images..."
sudo docker image ls | grep '^dev-ops' | awk '{print $3}' | xargs -I {} sudo docker rmi -f {} || echo "Error removing images"
