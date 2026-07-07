package com.university.portal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                UniversityPortalApp()
            }
        }
    }
}

data class AdminInfo(val office: String, val phone: String, val email: String)
data class StudentInfo(val id: String, val name: String, val program: String)
data class TeacherInfo(val name: String, val department: String, val officeHours: String)
data class ClassSchedule(val course: String, val day: String, val time: String, val room: String)

@Composable
fun UniversityPortalApp() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("University Portal") })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                SectionCard("Admin Info") {
                    val admin = AdminInfo(
                        office = "Admin Block - Room 201",
                        phone = "+92-300-1234567",
                        email = "admin@university.edu"
                    )
                    Text("Office: ${admin.office}")
                    Text("Phone: ${admin.phone}")
                    Text("Email: ${admin.email}")
                }
            }

            item {
                SectionCard("Student Info") {
                    val students = listOf(
                        StudentInfo("S001", "Ali Khan", "BS Computer Science"),
                        StudentInfo("S002", "Ayesha Noor", "BS Software Engineering")
                    )
                    students.forEach {
                        Text("${it.id} • ${it.name}")
                        Text("Program: ${it.program}")
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

            item {
                SectionCard("Teacher Info") {
                    val teachers = listOf(
                        TeacherInfo("Dr. Sara Ahmed", "Computer Science", "Mon 10:00-12:00"),
                        TeacherInfo("Prof. Hamza Tariq", "Software Engineering", "Wed 14:00-16:00")
                    )
                    teachers.forEach {
                        Text(it.name, fontWeight = FontWeight.SemiBold)
                        Text("Dept: ${it.department}")
                        Text("Office Hours: ${it.officeHours}")
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

            item {
                SectionCard("Class Schedule") {
                    val schedule = listOf(
                        ClassSchedule("OOP", "Monday", "09:00 AM - 10:30 AM", "Lab-1"),
                        ClassSchedule("Data Structures", "Tuesday", "11:00 AM - 12:30 PM", "Room-12"),
                        ClassSchedule("Database Systems", "Thursday", "01:30 PM - 03:00 PM", "Room-15")
                    )
                    schedule.forEach {
                        Text("${it.course} (${it.day})", fontWeight = FontWeight.SemiBold)
                        Text("Time: ${it.time}")
                        Text("Room: ${it.room}")
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }

            item {
                SectionCard("Additional Essentials") {
                    Text("• Attendance status")
                    Text("• Notices and announcements")
                    Text("• Exam dates")
                    Text("• Contact and support")
                }
            }
        }
    }
}

@Composable
fun SectionCard(title: String, content: @Composable () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Text(title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            content()
        }
    }
}
