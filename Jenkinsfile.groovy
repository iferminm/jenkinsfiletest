#!/usr/bin/env groovy


def start() {
    stage('test') {
       println "REMOTEANDO ${env.projectType}" 
    }
}


return this
