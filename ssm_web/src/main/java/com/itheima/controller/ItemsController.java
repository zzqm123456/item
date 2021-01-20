package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

//    public String list(Model model){
//        //集合查询
//        List<Items> items = itemsService.itemsLIst();
//         model.addAttribute("items",items);
//        return "items";
//
//    }
    @RequestMapping("/list")
    public ModelAndView list01() {
        ModelAndView modelAndView = new ModelAndView();
        List<Items> items = itemsService.itemsLIst();
        modelAndView.addObject("items", items);
        modelAndView.setViewName("items");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Items items){
        itemsService.save(items);

        return "redirect:/items/list";

    }

}
