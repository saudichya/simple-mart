pipeline {
	agent any

// 	environment {
// 		mavenHome = tool 'jenkins-maven'
// 	}

// 	tools {
// 		jdk 'java-17'
// 	}

	stages {

		stage('Build'){
			steps {
				echo "Build stage"
				sh "./gradlew build -DskipTests"
			}
		}

		stage('Test'){
			steps{
				echo "Test stage"
				sh "./gradlew test"
			}
		}

		stage('Deploy') {
			steps {
			    echo "Deploy stage empty for now"
			}
		}
	}
}