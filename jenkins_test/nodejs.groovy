job('NodeJs Example') {
    scm{
        git('git://github.com/wardviaene/docker-demo.git') {node -> // is hudson.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigName('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                        // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}


