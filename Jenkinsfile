pipeline {
    agent any
    
 	parameters{
		choice(
	        name: 'ENVIRONMENT',
	        choices: ['MO', 'QA'],
	        description: 'Environment to run against'
    	)
	 }

    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK21'
    }
    
    environment {
        API_KEY = credentials('MY_API_KEY')
    }

    stages {
         stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run TestNG') {
            steps {
                bat "mvn clean test -Dsurefire.suiteXmlFiles=testng.xml"
            }
        }
    }

    post {
        always {
            publishTestNGResults testNGPattern: '**/test-output/testng-results.xml'
        }
              
		success {
            emailext (
                to: 'vijeth2011@gmail.com',
                subject: "SUCCESS: ${env.JOB_NAME} Build #${env.BUILD_NUMBER}",
                body: "Build completed successfully."
            )
        }
        
        failure {
            emailext (
                to: 'vijeth2011@gmail.com',
                subject: "FAILURE: ${env.JOB_NAME} Build #${env.BUILD_NUMBER}",
                body: "Build failed. Please check the console output."
            )
        }
    }
}