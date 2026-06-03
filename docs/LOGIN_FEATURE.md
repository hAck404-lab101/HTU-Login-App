# Login Feature Documentation

## Purpose

This feature provides a simple login interface for a Ho Technical University Android school project.

## Screens

1. Login Screen
2. Dashboard Screen

## Files Added

```text
app/src/main/java/com/godwin/htuloginapp/MainActivity.java
app/src/main/java/com/godwin/htuloginapp/DashboardActivity.java
app/src/main/res/layout/activity_main.xml
app/src/main/res/layout/activity_dashboard.xml
app/src/main/res/drawable/bg_login_gradient.xml
app/src/main/res/drawable/bg_card.xml
app/src/main/res/drawable/bg_input.xml
app/src/main/res/drawable/bg_button.xml
app/src/main/res/drawable/bg_circle_logo.xml
app/src/main/res/drawable/bg_dashboard_card.xml
app/src/main/res/values/colors.xml
app/src/main/res/values/strings.xml
app/src/main/res/values/themes.xml
app/src/main/AndroidManifest.xml
```

## How It Works

The user enters an index number and password. The app checks that both fields are not empty. If valid, the user is moved to the dashboard screen.

## Security Note

This is not a real authentication system. It is for UI demonstration only. A production version should use a secure backend, encrypted transport, and proper authentication.

## Future Improvements

- Add real student database login
- Add password reset
- Add student profile screen
- Add course registration screen
- Add school notices screen
- Add fee status screen
