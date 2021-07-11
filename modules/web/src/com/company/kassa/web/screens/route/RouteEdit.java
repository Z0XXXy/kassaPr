package com.company.kassa.web.screens.route;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Route;

@UiController("kassa_Route.edit")
@UiDescriptor("route-edit.xml")
@EditedEntityContainer("routeDc")
@LoadDataBeforeShow
public class RouteEdit extends StandardEditor<Route> {
}