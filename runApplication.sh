#!/bin/bash
ps -eaf| grep jar| grep -v grep| awk '{print $2}'| xargs sudo kill -9
nohup java -jar /home/ec2-user/employee-data-0.0.1-SNAPSHOT.jar 1>/dev/null 2>/dev/null &
