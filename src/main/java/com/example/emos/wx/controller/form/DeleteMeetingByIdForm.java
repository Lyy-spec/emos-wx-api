package com.example.emos.wx.controller.form;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: lyy
 */


@Data
@ApiModel
public class DeleteMeetingByIdForm {
    @NotNull
    @Min(1)
    private Integer id;
}
