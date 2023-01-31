/*
 * MIT License
 *
 * Copyright (c) 2022 Wasiq Bhamla
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package com.github.wasiqb.boyka.testng.ui.mydemo.pages;

import static com.github.wasiqb.boyka.builders.Locator.buildLocator;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.iOSNsPredicateString;
import static org.openqa.selenium.By.id;

import com.github.wasiqb.boyka.builders.Locator;
import lombok.Getter;

/**
 * Login page object for Sauce demo application.
 *
 * @author Wasiq Bhamla
 * @since 24-Feb-2022
 */
@Getter
public class LoginPage {
    private static final LoginPage LOGIN_PAGE = new LoginPage ();

    /**
     * Login page object.
     *
     * @return {@link LoginPage}
     */
    public static LoginPage loginPage () {
        return LOGIN_PAGE;
    }

    private final Locator loginButton = buildLocator ().web (id ("login-button"))
        .android (accessibilityId ("Login button"))
        .ios (accessibilityId ("Login button"))
        .name ("Login Button")
        .build ();
    private final Locator loginUser   = buildLocator ().ios (iOSNsPredicateString ("label == \"bob@example.com\""))
        .name ("Login User")
        .build ();
    private final Locator password    = buildLocator ().web (id ("password"))
        .android (accessibilityId ("Password input field"))
        .ios (accessibilityId ("Password input field"))
        .name ("Password")
        .build ();
    private final Locator username    = buildLocator ().web (id ("user-name"))
        .android (accessibilityId ("Username input field"))
        .ios (accessibilityId ("Username input field"))
        .name ("User Name")
        .build ();

    private LoginPage () {
        // Avoid explicit class initialisation.
    }
}