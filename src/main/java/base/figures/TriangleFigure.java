package base.figures;

import base.colors.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TriangleFigure implements Figure {


    private ColorService colorService;

    @Autowired
    @Qualifier("redService")
    public void setColorService(ColorService colorService) {
        this.colorService = colorService;
    }

    public String getFigureName() {
        return "I am triangle!";
    }

    public String getFigureColor() {
        return colorService.getColor();
    }
}
