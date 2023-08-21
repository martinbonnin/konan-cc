plugins {
  id("org.jetbrains.kotlin.multiplatform").version("1.9.0")
}

kotlin {
  macosArm64()
  macosX64()

  targetHierarchy.default()
}