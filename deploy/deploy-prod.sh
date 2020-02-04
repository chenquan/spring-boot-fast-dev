#!/usr/bin/env bash
export PROFILE_ACTIVE = prod
docker-compose down --rmi all && docker-compose up -d
