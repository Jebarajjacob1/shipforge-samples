// The ShipForge .NET sample: an ASP.NET Core minimal API. The .NET buildpack
// makes it listen on the port in PORT.
var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/", () => Results.Text("Hello from ShipForge (.NET)\n"));
app.MapGet("/health", () => Results.Text("ok\n"));

app.Run();
