pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
        jdk 'JDK21'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/VIJETH-SATISH/testng-cucumber-successfully-integrated-2025.git'
            }
        }

        stage('Run TestNG') {
            steps {
                bat 'mvn clean test -Dsurefire.suiteXmlFiles=testng.xml'
            }
        }
    }

    post {
        always {
            publishTestNGResults testNGPattern: '**/test-output/testng-results.xml'
        }
    }
}