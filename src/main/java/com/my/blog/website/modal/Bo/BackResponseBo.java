package com.my.blog.website.modal.Bo;

import lombok.Data;

import java.io.Serializable;

/**
 *  2017/2/25.
 */
@Data
public class BackResponseBo implements Serializable {

    private String attachPath;
    private String themePath;
    private String sqlPath;

}
