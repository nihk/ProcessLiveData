import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.`android-application`: PluginDependencySpec
    get() = id("com.android.application")

val PluginDependenciesSpec.`android-library`: PluginDependencySpec
    get() = id("com.android.library")

val PluginDependenciesSpec.hilt: PluginDependencySpec
    get() = id("dagger.hilt.android.plugin")

// ./gradlew dependencyUpdates
val PluginDependenciesSpec.`ben-manes-versions`: PluginDependencySpec
    get() = id("com.github.ben-manes.versions") version Version.benManesVersions