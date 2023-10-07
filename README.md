# FestFusion Android App

FestFusion is an Android app developed for [Your College Name]'s internal hackathon. It's designed to help college students browse and discover college-related events and upload college information.

## Features

- Browse and discover college-related events, including hackathons, workshops, seminars, and social gatherings.
- Upload college information, including name, ID, password, and about section, along with an associated image.

## Screenshots

Here are some screenshots to give you a visual overview of how the app works:

### Home Screen

###College Listing
![image](https://github.com/Divyakumar21202/FestFusion/assets/124331485/8656e80d-7db2-4375-9e98-9a5e6441e0f7)

### Event Listing
![image](https://github.com/Divyakumar21202/FestFusion/assets/124331485/5452e3db-5aa6-4e3f-bf8a-6c079b4f9039)

### Upload College Info
![image](https://github.com/Divyakumar21202/FestFusion/assets/124331485/ff6add4c-ef3f-444c-9e8a-3bf5ab5310d2)




## Known Issues

RecyclerView gives error , Infinite Slider , Fragment Switching..

## Firebase Integration

This app relies on Firebase services for cloud storage, authentication, and real-time database functionality. To set up Firebase for this project, follow these steps:

1. **Create a Firebase Project:**

   - Go to the [Firebase Console](https://console.firebase.google.com/).
   - Click on "Add Project" and follow the on-screen instructions to create a new Firebase project.

2. **Add the Firebase Configuration File:**

   - After creating the Firebase project, download the Firebase configuration file (google-services.json) and place it in the app/ directory of your Android project.

3. **Enable Firebase Services:**

   - In the Firebase Console, navigate to your project and enable the following services:
     - Firebase Authentication: Set up your preferred authentication methods (e.g., email/password, Google Sign-In) and configure them in your app.
     - Firebase Realtime Database: Create a database and configure security rules as needed. Update the Firebase Database rules in the Firebase Console to control access to your data.
     - Firebase Storage: Set up Firebase Storage and configure security rules to control access to files.

4. **Update App Code:**

   - In your app's code, make sure to replace any placeholders with your Firebase project configuration, such as the Firebase project ID, API key, and other relevant settings.

5. **Testing and Development:**

   - Test your app thoroughly to ensure that Firebase services are integrated correctly. Make sure that authentication, real-time database, and storage functionality work as expected.

6. **Contributing with Firebase:**

   - If you are contributing to this project and making changes that affect Firebase integration, please ensure that your changes do not disrupt Firebase functionality.
   - Document any Firebase-related changes or dependencies in your pull request description to help reviewers understand the impact of your changes on Firebase services.

For more detailed information on Firebase integration, refer to the Firebase documentation: [Firebase Documentation](https://firebase.google.com/docs).

## Installation

1. Clone the repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the app on an Android emulator or physical device.

## Usage

- Launch the app.
- Browse events by clicking on the "Events" button.
- Upload college information by clicking on the "Upload Info" button.

## Contributing

We welcome contributions to improve this app.
If you encounter a bug or have a feature request, please open an issue on the GitHub repository.
If you'd like to contribute code, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and test thoroughly.
4. Create a pull request with a clear description of your changes.
