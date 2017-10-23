pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo './gradlew build' 
            }
        }
        stage('Test') {
            steps {
               echo './gradlew test'
            }
        }

    }
}
