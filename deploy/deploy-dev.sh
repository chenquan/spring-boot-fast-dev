#!/usr/bin/env bash
export PROFILE_ACTIVE = dev
docker-compose down --rmi all && docker-compose up -d
