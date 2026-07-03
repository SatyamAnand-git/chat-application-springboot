# 💬 Real-Time Chat Application

A real-time one-to-one chat application built using **Spring Boot**, **WebSocket (STOMP)**, **JWT Authentication**, **Spring Security**, and **MongoDB**.

Users can securely register, log in, exchange messages in real time, and view previous conversations.

---

## 🚀 Features

- ✅ User Registration
- ✅ User Login with JWT Authentication
- ✅ Spring Security Integration
- ✅ Secure WebSocket Communication
- ✅ One-to-One Private Messaging
- ✅ Conversation History
- ✅ MongoDB Database
- ✅ Modern Chat UI
- ✅ Auto Login using Stored JWT
- ✅ Real-Time Message Delivery

---

## 🛠️ Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Security
- Spring WebSocket (STOMP)
- JWT
- MongoDB
- Maven

### Frontend
- HTML
- CSS
- JavaScript
- SockJS
- STOMP.js

---

## 📂 Project Structure

```
src
│
├── configuration
│
├── controller
│
├── dto
│
├── entity
│
├── repository
│
├── security
│
├── service
│
└── resources
    └── static
        ├── login.html
        └── chat.html
```

---

## ⚙️ How It Works

1. User registers an account.
2. User logs in using email and password.
3. Spring Security authenticates the user.
4. JWT token is generated.
5. Token is stored in browser Local Storage.
6. Chat page automatically authenticates WebSocket connection.
7. Users exchange messages in real time.
8. Messages are stored in MongoDB.
9. Previous conversations are loaded automatically.

---

## 📸 Application Flow

```
Register
    │
    ▼
Login
    │
    ▼
JWT Generated
    │
    ▼
JWT Stored
    │
    ▼
WebSocket Connected
    │
    ▼
Private Chat
    │
    ▼
Messages Saved in MongoDB
    │
    ▼
Conversation History Loaded
```

---

## 🔐 Authentication

- JWT Authentication
- Stateless Security
- Protected REST APIs
- JWT Secured WebSocket Connection

---

## 📷 Screenshots

### Login Page

> Add Screenshot Here

---

### Chat Screen

> Add Screenshot Here

---

## 📌 Future Improvements

- Message Read Status
- Typing Indicator
- Online/Offline Status
- User Search
- Group Chat
- Profile Pictures
- File Sharing
- Emoji Support

---

## 👨‍💻 Author

**Satyam Anand**

GitHub:
https://github.com/SatyamAnand-git

LinkedIn:
(Add your LinkedIn profile)

---

## ⭐ If you found this project useful

Give it a ⭐ on GitHub.

<img width="1600" height="999" alt="WhatsApp Image 2026-07-03 at 8 20 09 PM" src="https://github.com/user-attachments/assets/2b679fb4-cac5-4a1c-9177-d4ff132ee214" />
