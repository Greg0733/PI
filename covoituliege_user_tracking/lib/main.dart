import 'package:flutter/material.dart';
import 'LoginPage.dart';

void main() => runApp(new UserTracking());

class UserTracking extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'User Tracking CovoitULiège',
      home: Container(
        child: LoginPage(),
      ),
    );
  }
}