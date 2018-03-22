#!/usr/bin/env groovy

def start() {
    stage('test') {
        println "REMOTEANDO ${env.projectType}" 
    }
    stage('test library function') {
        sayHello()
    }
    stage('Publishing to slack') {
        slackLogger.info("This is info")
        slackLogger.warning("This is warning")
        slackLogger.faulure("This is faulure")
        slackLogger.success("This is success")
    }
}


return this
