package com.github.wasdjkl.ideanotepad.services

import com.github.wasdjkl.ideanotepad.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
