import org.gradle.api.artifacts.dsl.RepositoryHandler

fun RepositoryHandler.addProjectDefaults() {
    google()
    jcenter()
    mavenCentral()
    maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots") }
    maven { setUrl("https://jitpack.io") }
}