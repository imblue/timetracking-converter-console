package com.mayobirne.dto;

import org.apache.poi.ss.usermodel.CellStyle;

/**
 * Created by Christian on 18.03.2016.
 */
public class CellStylesDTO {

    private CellStyle dateCellStyle;
    private CellStyle startTimeCellStyle;
    private CellStyle endTimeCellStyle;
    private CellStyle projectNrCellStyle;
    private CellStyle categoryCellStyle;
    private CellStyle descriptionCellStyle;

    public CellStylesDTO(CellStyle dateCellStyle, CellStyle startTimeCellStyle, CellStyle endTimeCellStyle,
                         CellStyle projectNrCellStyle, CellStyle categoryCellStyle, CellStyle descriptionCellStyle) {
        this.dateCellStyle = dateCellStyle;
        this.startTimeCellStyle = startTimeCellStyle;
        this.endTimeCellStyle = endTimeCellStyle;
        this.projectNrCellStyle = projectNrCellStyle;
        this.categoryCellStyle = categoryCellStyle;
        this.descriptionCellStyle = descriptionCellStyle;
    }

    public CellStyle getDateCellStyle() {
        return dateCellStyle;
    }

    public CellStyle getStartTimeCellStyle() {
        return startTimeCellStyle;
    }

    public CellStyle getEndTimeCellStyle() {
        return endTimeCellStyle;
    }

    public CellStyle getProjectNrCellStyle() {
        return projectNrCellStyle;
    }

    public CellStyle getCategoryCellStyle() {
        return categoryCellStyle;
    }

    public CellStyle getDescriptionCellStyle() {
        return descriptionCellStyle;
    }
}
