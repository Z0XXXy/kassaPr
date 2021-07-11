package com.company.kassa.web.screens.route;

import com.haulmont.cuba.gui.screen.*;
import com.company.kassa.entity.Route;

@UiController("kassa_Route.browse")
@UiDescriptor("route-browse.xml")
@LookupComponent("routesTable")
@LoadDataBeforeShow
public class RouteBrowse extends StandardLookup<Route> {
}