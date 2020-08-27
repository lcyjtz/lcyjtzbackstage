package com.example.lcyjtz.Controller;

import com.example.lcyjtz.Service.MyService;
import com.example.lcyjtz.Tools.Tools;
import com.example.lcyjtz.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class MyController {
    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    /**
     * Home page query content
     * You need to query different types of files for their different paths=assets/video or assets/picture and assets/Article;
     * Get the suffix name from the field, query the file suffix. TXT for the first 100 words, and then add to the entity class
     * HomePage functions are all realized
     */
    @GetMapping("HomePage")
    public Map<String, Object> HomePage() {
        Map<String, Object> map = new HashMap<>();
        List<Record> SelectRecordAll = myService.SelectRecordAll();
        for (int i = 0; i < SelectRecordAll.size(); i++) {
            String FileName = SelectRecordAll.get(i).getRecordFilename();
            int length = FileName.length();
            if (length > 4) {
                String NameSuffix = FileName.substring(length - 4, length);
                if (NameSuffix.equals(".txt")) {
                    String FileNamePath = SelectRecordAll.get(i).getRecordPath();
                    String cs = ClassUtils.getDefaultClassLoader().getResource("").getPath();
                    String Path = cs + "/static" + FileNamePath + FileName;
                    File file = new File(Path);
                    if (!file.exists()) {
                        SelectRecordAll.get(i).setGeneralContent("没有这个文件或者路径不正确");
                    } else {
                        Tools tools = new Tools();
                        String Content = tools.RoughlyTheContent(Path);
                        Content = Content.substring(0, 120) + "...";
                        SelectRecordAll.get(i).setGeneralContent(Content);
                    }
                } else {
                    SelectRecordAll.get(i).setGeneralContent("不属于txt文件");
                }
            } else {
                System.out.println(FileName + "这个文件名不正确");
            }
        }
        map.put("RecordAll", SelectRecordAll);
        return map;
    }

    @PostMapping("PicturePage")
    public Map<String, Object> picture() {
        Map<String, Object> picture = new HashMap<>();

        return picture;
    }
}
