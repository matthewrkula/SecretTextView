SecretTextView
==============

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SecretTextView-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1316)

A TextView that simulates the effect from the app Secret where the characters fade in/out at different speeds.

<img src="https://i.imgflip.com/95m91.gif"/>

How To Use
==============
Use it just like a normal TextView for the most part.
```xml
    <com.mattkula.secrettextview.SecretTextView
            android:id="@+id/textview"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="This is a demo of Matt Kula's Secret TextView"
            android:textSize="30sp"
            android:textColor="@android:color/black"
            />
```

To fade in or fade out the text:
```java
secretTextView.show();    // fade in
secretTextView.hide();    // fade out
secretTextView.toggle();  // fade in or out depending on current state
```

To change the duration of the fading (default is 2.5 seconds):
```java
secretTextView.setDuration(3000);     // set fade duration to 3 seconds
```

To set visibility without fading in or out:
```java
secretTextView.setIsVisible(true);
secretTextView.setIsVisible(false);
```
