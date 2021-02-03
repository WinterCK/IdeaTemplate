package com.github.winterck.ideatemplate.services

import com.github.winterck.ideatemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
