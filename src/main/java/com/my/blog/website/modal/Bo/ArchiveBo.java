package com.my.blog.website.modal.Bo;

import com.my.blog.website.modal.Vo.ContentVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  2017/2/23.
 */
@Data
public class ArchiveBo implements Serializable {

    private String date;
    private String count;
    private List<ContentVo> articles;

    public String getDate() {
        return date;
    }


}
