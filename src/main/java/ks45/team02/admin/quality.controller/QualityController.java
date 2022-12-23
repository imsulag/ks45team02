package ks45.team02.admin.quality.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quality")
public class QualityController {

    @GetMapping("/addGeneralQualityLevel")
    public String addGeneralQualityLevel () {

        return "quality/addGeneralQualityLevel";
    }

    @GetMapping("/addHazadousSubstanceLevel")
    public String addHazadousSubstanceLevel () {

        return "quality/addHazadousSubstanceLevel";
    }

    @GetMapping("/deleteGeneralQualityLevel")
    public String deleteGeneralQualityLevel () {

        return "quality/deleteGeneralQualityLevel";
    }

    @GetMapping("/deleteHazadousSubstanceLevel")
    public String deleteHazadousSubstanceLevel () {

        return "quality/deleteHazadousSubstanceLevel";
    }

    @GetMapping("/listGeneralQualityLevel")
    public String listGeneralQualityLevel () {

        return "quality/listGeneralQualityLevel";
    }

    @GetMapping("/listHazadousSubstanceLevel")
    public String listHazadousSubstanceLevel () {

        return "quality/listHazadousSubstanceLevel";
    }

    @GetMapping("/listQualityInspectionStandards")
    public String listQualityInspectionStandards () {

        return "quality/listQualityInspectionStandards";
    }

    @GetMapping("/modifyGeneralQualityLevel")
    public String modifyGeneralQualityLevel () {

        return "quality/modifyGeneralQualityLevel";
    }

    @GetMapping("/modifyHazadousSubstanceLevel")
    public String modifyHazadousSubstanceLevel () {

        return "quality/modifyHazadousSubstanceLevel";
    }

    @GetMapping("/requestHazadousSubstanceLevel")
    public String requestHazadousSubstanceLevel () {

        return "quality/requestHazadousSubstanceLevel";
    }
}
