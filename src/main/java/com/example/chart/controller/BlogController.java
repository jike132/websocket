package com.example.chart.controller;



import com.example.chart.entity.BlogModel;
import com.example.chart.serviceI.BlogRepository;


import com.example.chart.utils.Result;
import com.example.chart.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blog")
public class BlogController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private BlogRepository blogRepository;



    @PostMapping("/add")
    public String add(@RequestBody BlogModel blogModel) {
        logger.info(blogModel.toString());
        blogRepository.save(blogModel);

        return "success";
    }
    @GetMapping("/get/{id}")
    public Result getById(@PathVariable String id) {
        if (StringUtils.isEmpty(id))
            return ResultUtils.fail("失败");
        Optional<BlogModel> blogModelOptional = blogRepository.findById(id);
        if (blogModelOptional.isPresent()) {
            BlogModel blogModel = blogModelOptional.get();
            return ResultUtils.success(blogModel);
        }
        return ResultUtils.fail("失败");
    }
    @GetMapping("/get")
    public Result getAll() {
        Iterable<BlogModel> iterable = blogRepository.findAll();
        List<BlogModel> list = new ArrayList<>();
        iterable.forEach(list::add);
        return ResultUtils.success(list);
    }
    @PostMapping("/update")
    public Result updateById(@RequestBody BlogModel blogModel) {
        String id = blogModel.getId();
        if (StringUtils.isEmpty(id))
            return ResultUtils.fail("失败");
        blogRepository.save(blogModel);
        return ResultUtils.success("success");
    }
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable String id) {
        if (StringUtils.isEmpty(id))
            return ResultUtils.fail("失败");
        blogRepository.deleteById(id);
        return ResultUtils.success("success");
    }
    @GetMapping("/rep/search/title")
    public Result repSearchTitle(String keyword) {
        if (StringUtils.isEmpty(keyword))
            return ResultUtils.fail("失败");
        return ResultUtils.success(blogRepository.findByTitleLike(keyword));
    }
    @GetMapping("/rep/search/custom")
    public Result repSearchCustom(String keyword) {
        if (StringUtils.isEmpty(keyword))
            return ResultUtils.fail("失败");
        return ResultUtils.success(blogRepository.findByTitleCustom(keyword));
    }
}
