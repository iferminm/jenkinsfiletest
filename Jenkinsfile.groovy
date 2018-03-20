#!/usr/bin/env groovy
@Library('PipelineLibrary') _


def start() {
    stage('test') {
        println "REMOTEANDO ${env.projectType}" 
    }
    stage('test library function') {
        sayHello()
    }
}


return this
