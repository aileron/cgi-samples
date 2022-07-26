from http.server import HTTPServer, CGIHTTPRequestHandler

class Handler(CGIHTTPRequestHandler):
    cgi_directories = ["/bin"]

PORT = 8080
httpd = HTTPServer(("", PORT), Handler)
httpd.serve_forever()
