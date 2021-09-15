import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

application {
    mainClass.set("DemoKt")
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
}

plugins {
    application
    kotlin("jvm") version "1.5.30"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "17"
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xlint")
}


// Java 9
tasks.register<JavaExec>("DemoPrivateMethodInInterface") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoPrivateMethodInInterface")
}

tasks.register<JavaExec>("DemoDiamondOperatorForAnonymousInnerClasses") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoDiamondOperatorForAnonymousInnerClasses")
}

tasks.register<JavaExec>("DemoNewTryWithResources") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoNewTryWithResources")
}

tasks.register<JavaExec>("DemoNewOptionalMethods") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoNewOptionalMethods")
}

tasks.register<JavaExec>("DemoCollectionFactoryMethods") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoCollectionFactoryMethods")
}

// Java 10
tasks.register<JavaExec>("DemoLocalTypeInference") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j10.DemoLocalTypeInference")
}

// Java 14
tasks.register<JavaExec>("DemoSwitchExpressions") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j14.DemoSwitchExpressions")
}

// Java 15
tasks.register<JavaExec>("DemoNPEBetterErrorMsg") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j15.DemoNPEBetterErrorMsg")
}

tasks.register<JavaExec>("DemoTextBlock") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j15.DemoTextBlock")
}

// Java 16
tasks.register<JavaExec>("DemoInstanceofPatternMatching") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j16.DemoInstanceofPatternMatching")
}

tasks.register<JavaExec>("DemoRecords") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j16.DemoRecords")
}

// Java 17
tasks.register<JavaExec>("DemoSealedInterface") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j17.DemoSealedInterface")
}

// Kotlin
tasks.register<JavaExec>("DemoNullSafety") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("DemoNullSafetyKt")
}

tasks.register<JavaExec>("DemoFunctions") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("DemoFunctionsKt")
}

tasks.register<JavaExec>("DemoDataClasses") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("DemoDataClassesKt")
}

tasks.register<JavaExec>("DemoExtensions") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("DemoExtensionsKt")
}

tasks.register<JavaExec>("DemoStringInterpolation") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("DemoStringInterpolationKt")
}
