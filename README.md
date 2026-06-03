# HTU Login App

A simple Android school project app that demonstrates a clean **Ho Technical University Student Portal Login** screen.

## Project Overview

This project is built with:

- Java
- XML layouts
- Native Android Views
- Material-style custom drawables
- Basic login form validation

The app does not connect to a real school database yet. It is designed as a UI and navigation demo for a school project.

## Current Features

- HTU-themed login page
- Index number input
- Password input
- Basic validation
- Login button
- Dashboard screen after successful login
- Clean mobile-friendly layout
- Project documentation for presentation

## App Screens

1. **Login Screen**
   - Displays HTU branding
   - Accepts index number and password
   - Shows error messages for empty fields

2. **Dashboard Screen**
   - Welcomes the student using the entered index number
   - Shows a simple student portal dashboard message

## How to Open in Android Studio

1. Clone the repository:

```bash
git clone https://github.com/hAck404-lab101/HTU-Login-App.git
```

2. Open Android Studio.
3. Select **Open**.
4. Choose the cloned project folder.
5. Wait for Gradle sync to finish.
6. Run the app on an emulator or Android phone.

## Package Name

```java
com.godwin.htuloginapp
```

## Git Workflow

Work is added through a feature branch first before merging into `main`.

Current starter branch:

```bash
feature/htu-login-starter
```

## Login Demo Note

This project uses simple frontend validation only. A production login system should use a secure backend, HTTPS, password hashing, and proper authentication.
