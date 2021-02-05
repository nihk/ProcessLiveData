import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.defaultAndroidTestDependencies() {
    "androidTestImplementation"(Dependency.Espresso.core)
    "androidTestImplementation"(Dependency.Espresso.contrib)
    "androidTestImplementation"(Dependency.AndroidTest.core)
    "androidTestImplementation"(Dependency.AndroidTest.coreKtx)
    "androidTestImplementation"(Dependency.AndroidTest.extJunit)
    "androidTestImplementation"(Dependency.AndroidTest.runner)
    "androidTestImplementation"(Dependency.AndroidTest.rules)
}