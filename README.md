To reproduce:

* git clone https://github.com/martinbonnin/konan-cc
* cd konan-cc
* git checkout 49905000ecad1515f773864f58217aa9108ce0ce
* ./gradlew assemble

Output:

```
mbonnin:~/git/konan-cc$ ./gradlew assemble
Calculating task graph as no configuration cache is available for tasks: assemble

> Configure project :

Please wait while Kotlin/Native compiler 1.9.0 is being installed.
Download https://download.jetbrains.com/kotlin/native/builds/releases/1.9.0/macos-aarch64/kotlin-native-prebuilt-macos-aarch64-1.9.0.tar.gz (319.44 MB)
Download kotlin-native-prebuilt-macos-aarch64-1.9.0.tar.gz finished, took 8 ms
Unpack Kotlin/Native compiler to /Users/mbonnin/.konan/kotlin-native-prebuilt-macos-aarch64-1.9.0
Unpack Kotlin/Native compiler to /Users/mbonnin/.konan/kotlin-native-prebuilt-macos-aarch64-1.9.0 finished, took 8 s 529 ms

> Task :compileMacosMainKotlinMetadata
Downloading native dependencies (LLVM, sysroot etc). This is a one-time action performed only on the first run of the compiler.

(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-4-macos.tar.gz (0/64230999). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-4-macos.tar.gz (15515081/64230999). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-4-macos.tar.gz (31473097/64230999). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-4-macos.tar.gz (46464457/64230999). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-4-macos.tar.gz (62193097/64230999). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-4-macos.tar.gz (64230999/64230999). Done.
Extracting dependency: /Users/mbonnin/.konan/cache/lldb-4-macos.tar.gz into /Users/mbonnin/.konan/dependencies

(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/apple-llvm-20200714-macos-aarch64-essentials.tar.gz (0/86257507). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/apple-llvm-20200714-macos-aarch64-essentials.tar.gz (16402369/86257507). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/apple-llvm-20200714-macos-aarch64-essentials.tar.gz (33054499/86257507). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/apple-llvm-20200714-macos-aarch64-essentials.tar.gz (48568115/86257507). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/apple-llvm-20200714-macos-aarch64-essentials.tar.gz (64747425/86257507). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/apple-llvm-20200714-macos-aarch64-essentials.tar.gz (79741227/86257507). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/apple-llvm-20200714-macos-aarch64-essentials.tar.gz (86257507/86257507). Done
Extracting dependency: /Users/mbonnin/.konan/cache/apple-llvm-20200714-macos-aarch64-essentials.tar.gz into /Users/mbonnin/.konan/dependencies

(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/libffi-3.3-1-macos-arm64.tar.gz (0/17037). 
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/libffi-3.3-1-macos-arm64.tar.gz (17037/17037). Done.
Extracting dependency: /Users/mbonnin/.konan/cache/libffi-3.3-1-macos-arm64.tar.gz into /Users/mbonnin/.konan/dependencies
e: file:///Users/mbonnin/git/konan-cc/src/macosMain/kotlin/Main.kt:1:8 Unresolved reference: platform
e: file:///Users/mbonnin/git/konan-cc/src/macosMain/kotlin/Main.kt:2:8 Unresolved reference: platform
e: file:///Users/mbonnin/git/konan-cc/src/macosMain/kotlin/Main.kt:5:13 Unresolved reference: NSDate

> Task :compileMacosMainKotlinMetadata FAILED

0 problems were found storing the configuration cache.

See the complete report at file:///Users/mbonnin/git/konan-cc/build/reports/configuration-cache/9vviafbq0p8h1cptf284u9p80/16ef5iuleu4gx3m8hkqnqblu/configuration-cache-report.html

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileMacosMainKotlinMetadata'.
> Compilation finished with errors

```

Re-running the task works well