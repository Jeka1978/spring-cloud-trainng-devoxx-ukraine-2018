#!/bin/bash

cd ./04_discovery
./discovery-delete.sh

cd ../03_frontend
./service-destory.sh

cd ../02_config_service
./service-destroy.sh

cd ../01_pods
./pods-destroy.sh