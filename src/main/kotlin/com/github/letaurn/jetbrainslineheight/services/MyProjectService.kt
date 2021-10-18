package com.github.letaurn.jetbrainslineheight.services

import com.intellij.openapi.project.Project
import com.github.letaurn.jetbrainslineheight.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
