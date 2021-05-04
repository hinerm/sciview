rootProject.name = "sciview"

gradle.rootProject {
    //    group = "scenery"
    version = "0.2.0-beta-9-SNAPSHOT"
    description = "Scenery-backed 3D visualization package for ImageJ."
}

if (System.getProperty("CI").toBoolean() != true && System.getenv("CI").toBoolean() != true) {
    if(File("../scenery/build.gradle.kts").exists()) {
        logger.warn("Including local scenery project instead of version declared in build")
        includeBuild("../scenery")
    }
}

