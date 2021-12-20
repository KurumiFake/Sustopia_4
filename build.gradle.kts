plugins {
    `java-library`
    id("xyz.jpenilla.toothpick")
}

toothpick {
    forkName = "Sustopia"
    groupId = "me.kurumifake"
    val versionTag = System.getenv("BUILD_NUMBER")
        ?: "\"${commitHash() ?: error("Could not obtain git hash")}\""
    forkVersion = "git-$forkName-$versionTag"
    forkUrl = "https://github.com/KurumiFake/Sustopia"

    minecraftVersion = "1.16.5"
    nmsPackage = "1_16_R3"
    nmsRevision = "R0.1-SNAPSHOT"

    upstream = "Airplane"
    upstreamBranch = "origin/master"

    paperclipName = "sustopia-paperclip"

    server {
        project = project(":$forkNameLowercase-server")
        patchesDir = file("patches/server")
    }
    api {
        project = project(":$forkNameLowercase-api")
        patchesDir = file("patches/api")
    }
}

subprojects {
    repositories {
        mavenCentral()
        maven("https://repo.aikar.co/content/groups/aikar/")
        maven("https://nexus.velocitypowered.com/repository/velocity-artifacts-snapshots/")
        maven("https://libraries.minecraft.net")
        maven("https://jitpack.io")
        mavenLocal()
    }

    java {
        sourceCompatibility = JavaVersion.toVersion(8)
        targetCompatibility = JavaVersion.toVersion(8)
    }
}
