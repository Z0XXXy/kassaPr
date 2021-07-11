package com.company.kassa.web.screens.travel;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Travel;

@UiController("kassa_Travel.edit")
@UiDescriptor("travel-edit.xml")
@EditedEntityContainer("travelDc")
@LoadDataBeforeShow
public class TravelEdit extends StandardEditor<Travel> {
}