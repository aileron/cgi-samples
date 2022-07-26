#!/usr/bin/swift

import Foundation

print("Content-type:text/html\n\n")
print("<html>")
print("<head>")
print("<title>Hello, world!</title>")
print("</head>")
print("<body>")

let query = ProcessInfo.processInfo.environment["QUERY_STRING"] ?? ""
if let name = URLComponents(string: "http://localhost?" + query)?.queryItems?.first(where: { $0.name == "name" })?.value {
    print("Hello \(name)")
} else  {
    print("Hello, !")
}

print("</body>")
print("</html>")
