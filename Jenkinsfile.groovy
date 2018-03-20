#!/usr/bin/env groovy

def start() {
    stage('test') {
        println "REMOTEANDO ${env.projectType}" 
    }
    stage('test library function') {
        sayHello()
    }
}


return this
