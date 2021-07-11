package com.company.kassa.web.screens.passanger;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Passanger;

@UiController("kassa_Passanger.edit")
@UiDescriptor("passanger-edit.xml")
@EditedEntityContainer("passangerDc")
@LoadDataBeforeShow
public class PassangerEdit extends StandardEditor<Passanger> {
}