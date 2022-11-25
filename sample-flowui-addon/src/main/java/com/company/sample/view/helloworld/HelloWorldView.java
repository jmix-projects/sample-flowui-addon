package com.company.sample.view.helloworld;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DefaultMainViewParent;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "HelloWorldView", layout = DefaultMainViewParent.class)
@ViewController("sample_HelloWorldView")
@ViewDescriptor("hello-world-view.xml")
public class HelloWorldView extends StandardView {
}