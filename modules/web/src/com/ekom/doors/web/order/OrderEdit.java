
package com.ekom.doors.web.order;

import com.ekom.doors.entity.Order;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.PickerField;

import javax.inject.Named;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;


public class OrderEdit extends AbstractEditor<Order> {
    @Named("fieldGroup.customer")
    private PickerField customerField;


    @Named("fieldGroup.door")
    private PickerField doorField;


    @Named("fieldGroup.date")
    private DateField dateField;

    @Override
    public void init(Map<String, Object> params) {

            super.init(params);
            customerField.addLookupAction().setLookupScreenOpenType(WindowManager.OpenType.DIALOG);
            customerField.addOpenAction().setEditScreenOpenType(WindowManager.OpenType.DIALOG);
            doorField.addLookupAction().setLookupScreenOpenType(WindowManager.OpenType.DIALOG);
            doorField.addOpenAction().setEditScreenOpenType(WindowManager.OpenType.DIALOG);


    }

}