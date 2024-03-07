package com.itgenius.sample.controllers

import com.itgenius.sample.models.Sampledata
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/sample")
class SampleController {

    @GetMapping("/hello")
    fun hello():String {
        return "Hello Controllers"
    }

    @GetMapping
    fun getSample():List<Sampledata>{
        return listOf(
            Sampledata(1,"Harrie","aa@aa.aa","123456798","aaa, 123"),
            Sampledata(2,"Harrie","aa@aa.aa","123456798","aaa, 123"),
            Sampledata(3,"Harrie","aa@aa.aa","123456798","aaa, 123"),

        )
    }

    @GetMapping("/{id}")
    fun getSampleById(@PathVariable id:Int):Sampledata{
        return Sampledata(
            id,"Harrie","aa@aa.aa","123456798","aaa, 123"
        )
    }

    @PostMapping
    fun createSample(@RequestBody sampledata: Sampledata): Sampledata{
        return sampledata
    }

    @PutMapping("/{id}")
    fun updateSample(@PathVariable id:Int, @RequestBody sampledata: Sampledata) :Sampledata {
        return sampledata.copy(id = id)
    }

    // Delete: http://localhost:8080/api/sample/1
    @DeleteMapping("/{id}")
    fun deleteSample(@PathVariable id: Int): String {
        return "Sample ID $id has been deleted"
    }


}