grails.project.dependency.distribution = {
  remoteRepository(id:"gbif-spain-snapshots", url:"http://repository.gbif.org/content/repositories/gbif-spain-snapshots/") {
    authentication username: System.getenv("TRAVIS_DEPLOY_USERNAME"), password: System.getenv("TRAVIS_DEPLOY_PASSWORD")
  }

  remoteRepository(id:"gbif-spain-release",  url:"http://repository.gbif.org/content/repositories/gbif-spain-releases/") {
    authentication username: System.getenv("TRAVIS_DEPLOY_USERNAME"), password: System.getenv("TRAVIS_DEPLOY_PASSWORD")
  }
}
